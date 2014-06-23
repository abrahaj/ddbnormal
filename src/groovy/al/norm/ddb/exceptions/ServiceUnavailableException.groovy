package al.norm.ddb.exceptions

class ServiceUnavailableException extends Exception{
  ServiceUnavailableException(Map map, String message) {
    super()
  }

  ServiceUnavailableException(String description) {
    super(description)
  }
}
