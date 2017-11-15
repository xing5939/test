package service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.ScService;
import vo.Sc;

@Service("scService")
@Transactional
public class ScServiceImpl implements ScService {

	@Override
	public List<Sc> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Sc object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Sc object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Sc object) {
		// TODO Auto-generated method stub

	}

}
