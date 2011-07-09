package code.smells.doesitexist.take1;

public class CatPresenter {

	private final CatRepository catRepository;

	private CatPresenter(CatRepository catRepository) {
		this.catRepository = catRepository;
	}
	
	public View displayCat(CatReference reference) {
		
		Cat cat = catRepository.get(reference);
		
		if (cat == null) {
			return new View(reference);
		}
		return new View(cat);
	}
}
