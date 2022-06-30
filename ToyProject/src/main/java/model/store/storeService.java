package model.store;

import java.util.List;

public interface storeService {
	void insertStore(storeVO vo);
	void updateStore(storeVO vo);
	void deleteStore(storeVO vo);
	storeVO getStore(storeVO vo);
	List<storeVO> getStoreList(storeVO vo);
}
