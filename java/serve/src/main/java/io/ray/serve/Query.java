package io.ray.serve;

import java.util.List;

/**
 * Query.
 */
public class Query {

  private List<Object> args;

  private RequestMetadata metadata;

  public Query(List<Object> args, RequestMetadata requestMetadata) {
    this.args = args;
    this.metadata = requestMetadata;
  }

  public List<Object> getArgs() {
    return args;
  }

  public void setArgs(List<Object> args) {
    this.args = args;
  }

  public RequestMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(RequestMetadata metadata) {
    this.metadata = metadata;
  }

}
