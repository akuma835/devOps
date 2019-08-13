package com.cg.devops.stub;

import org.springframework.stereotype.Repository;

import com.cg.devops.dao.ReportDao;

@Repository
public class ReportDaoStub implements ReportDao {

	@Override
	public int getBugs(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVulnerability(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCodeSmell(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHotspot(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinor(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCritical(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getInfo(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMajor(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBlocker(String language) {
		// TODO Auto-generated method stub
		return 0;
	}

}
