package code.smells.doesitexist.take2;

public class CatPresenter {

	private final CatRepository catRepository;

	private CatPresenter(CatRepository catRepository) {
		this.catRepository = catRepository;
	}
	
	public View displayCat(CatReference reference) {
		
		if (catRepository.hasCat(reference)) {
			return new ICantFindThisCatView(reference);
		}
		
		Cat cat = catRepository.get(reference);
		return new CatView(cat);
	}
}
