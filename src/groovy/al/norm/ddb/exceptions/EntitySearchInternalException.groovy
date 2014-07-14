package al.norm.ddb.exceptions

class EntitySearchInternalException extends Exception{
  EntitySearchInternalException(Map map, String message) {
    super()
  }

  EntitySearchInternalException(String description) {
    super(description)
  }
}
