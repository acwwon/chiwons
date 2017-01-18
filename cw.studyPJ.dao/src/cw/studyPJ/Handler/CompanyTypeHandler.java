package cw.studyPJ.Handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import cw.studyPJ.domain.TypeEnum;

public class CompanyTypeHandler implements TypeHandler<TypeEnum>{
	

	@Override
	public TypeEnum getResult(ResultSet rs, String columnName) throws SQLException {
		//
		String typeCode = rs.getString(columnName);
		return TypeEnum.getByCode(typeCode);
	}

	@Override
	public TypeEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		//
		String typeCode = rs.getString(columnIndex);
		return TypeEnum.getByCode(typeCode);
	}

	@Override
	public TypeEnum getResult(CallableStatement cstmt, int columnIndex) throws SQLException {
		//
		String typeCode = cstmt.getString(columnIndex);
		return TypeEnum.getByCode(typeCode);
	}

	public void setParameter(PreparedStatement pstmt, int paramIndex, TypeEnum param, JdbcType jdbcType) throws SQLException {
		//
		pstmt.setString(paramIndex, param.getCode());
	}


}
