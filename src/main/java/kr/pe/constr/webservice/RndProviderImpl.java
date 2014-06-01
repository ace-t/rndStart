package kr.pe.constr.webservice;

import javax.jws.WebService;

import kr.pe.constr.login.vo.UserVo;

@WebService(endpointInterface="kr.pe.constr.webservice.RndProvider")
public class RndProviderImpl implements RndProvider {
	
	//Logger logger = LogManager.getLogger(RndProviderImpl.class);

	@Override
	public int acet(UserVo userVo) {
		// TODO Auto-generated method stub
		System.out.println(userVo.getId()+"====="+userVo.getName());
		if(userVo.getId().equals("acet")){
			return 1000;
		}
		return 0;
	}

}
