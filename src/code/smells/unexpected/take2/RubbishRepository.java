package code.smells.unexpected.take2;

public class RubbishRepository {

	private Database database;
	
	public Rubbish get(RubbishReference reference) {
		
		if (database.hasNoReferenceTo(reference)) {
			throw new RubbishNotFoundException("cannot find rubbish referenced by " + reference);
		}

		return database.get(reference);
	}

	public void save(Rubbish rubbish) {
		database.save(rubbish);
	}
}
