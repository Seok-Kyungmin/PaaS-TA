package poly.service.impl;

import static poly.util.CmmUtil.nvl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mortbay.log.Log;
import org.springframework.stereotype.Service;

import poly.dto.UserDTO;
import poly.persistance.mapper.IUserMapper;
import poly.service.IUserService;

@Service("UserService")
public class UserService implements IUserService {

	@Resource(name = "UserMapper")
	private IUserMapper userMapper;

	@Override
	public UserDTO getUserInfo(UserDTO uDTO) throws Exception {
		return userMapper.getUserInfo(uDTO);
	}

	@Override
	public int insertUserInfo(UserDTO uDTO) throws Exception {

		// 회원가입 성공 :1, 아이디 중복으로 인한 취소 : 2, 기타에러발생 :0
		int res = 0;

		if (uDTO == null) {
			uDTO = new UserDTO();
		}

		// 회원가입 중복 장지를 위해 DB에서 데이터 조회
		Log.info("getgetUserExists start");
		UserDTO rDTO = userMapper.getUserExists(uDTO);
		Log.info("getgetUserExists end");

		// mapper에서 값이 정상적으로 못 넘어오는 경우를 대비
		if (rDTO == null) {
			rDTO = new UserDTO();
		}

		// 중복된 회원정보가 있는경우, 결과값을 2로 변경하고, 더 이상 작업 진행하지 않음
		if (nvl(rDTO.getExists_yn()).equals("Y")) {
			res = 2;
		} else {
			// 화원가입
			Log.info("InsertUserInfo start");
			int success = userMapper.insertUserInfo(uDTO);
			Log.info("InsertUserInfo end");

			// db에 데이터가 등록되었다면,
			if (success > 0) {
				res = 1;
			} else {
				res = 0;
			}

		}
		return res;
	}

	// 아이디 확인
	@Override
	public UserDTO idCheck(String userId) throws Exception {

		return userMapper.idCheck(userId);
	}

	@Override
	public int updateJoinStudy(Map<String, String> sMap) throws Exception {
		return userMapper.updateJoinStudy(sMap);
	}

	@Override
	public int updateLeaveStudy(Map<String, String> pMap) throws Exception {
		return userMapper.updateLeaveStudy(pMap);
	}

	@Override
	public int updateUserMbti(UserDTO pDTO) throws Exception {
		return userMapper.updateUserMbti(pDTO);
	}

	@Override
	public List<String> getUserMbti(List<String> list) throws Exception {
		return userMapper.getUserMbti(list);
	}

	@Override
	public UserDTO getUserKakao(HashMap<String, String> pMap) {
		return userMapper.getUserKakao(pMap);
	}

	@Override
	public HashMap<String, Integer> getMbtiCount() {
		String[] mbti = {"ENFJ", "ENFP", "ENTJ", "ENTP", "ESFJ",
						"ESFP", "ESTJ", "ESTP", "INFJ", "INFP",
						"INTJ", "INTP", "ISFJ", "ISFP", "ISTJ", "ISTP" };
				
		List<String> wList = new ArrayList<String>();
		wList = userMapper.getMbtiCount();
		System.out.println("wList : " + wList);
		
		// 빈도수 체크 하여 HashMap으로 변환
		HashMap<String, Integer> wMap = new HashMap<String, Integer>();
		
		for(int i=0; i<mbti.length; i++) {
			int aFrequency = Collections.frequency(wList, mbti[i]);
			wMap.put(mbti[i], aFrequency);
		}
		System.out.println("wMap : "+ wMap);
		return wMap;
	}

	
}
