package kr.pe.constr.webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import kr.pe.constr.login.vo.UserVo;

@WebService
@SOAPBinding(
		style = SOAPBinding.Style.DOCUMENT,
		use =  SOAPBinding.Use.LITERAL,
		parameterStyle = SOAPBinding.ParameterStyle.WRAPPED
		)

public interface RndProvider {
	public int acet(UserVo userVo);

}
