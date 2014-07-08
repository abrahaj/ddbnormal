package al.norm.ddb.exceptions

class ItemInternalStructureException extends Exception{
  ItemInternalStructureException(Map map, String message) {
    super()
  }

  ItemInternalStructureException(String description) {
    super(description)
  }
}
