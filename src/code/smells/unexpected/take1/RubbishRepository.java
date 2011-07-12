package code.smells.unexpected.take1;

public class RubbishRepository {

	private Database database;
	
	public Rubbish getOrCreateRubbish(RubbishReference reference) {
		
		if (database.hasNoReferenceTo(reference)) {
			database.insert(new Rubbish(reference));
		}

		return database.get(reference);
	}
}
