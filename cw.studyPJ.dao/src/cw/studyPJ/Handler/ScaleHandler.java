package cw.studyPJ.Handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import cw.studyPJ.domain.ScaleEnum;

public class ScaleHandler implements TypeHandler<ScaleEnum>{
	

	@Override
	public ScaleEnum getResult(ResultSet rs, String columnName) throws SQLException {
		//
		String scaleCode = rs.getString(columnName);
		return ScaleEnum.getByCode(scaleCode);
	}

	@Override
	public ScaleEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		//
		String scaleCode = rs.getString(columnIndex);
		return ScaleEnum.getByCode(scaleCode);
	}

	@Override
	public ScaleEnum getResult(CallableStatement cstmt, int columnIndex) throws SQLException {
		//
		String scaleCode = cstmt.getString(columnIndex);
		return ScaleEnum.getByCode(scaleCode);
	}

	public void setParameter(PreparedStatement pstmt, int paramIndex, ScaleEnum param, JdbcType jdbcType) throws SQLException {
		//
		pstmt.setString(paramIndex, param.getCode());
	}


}
