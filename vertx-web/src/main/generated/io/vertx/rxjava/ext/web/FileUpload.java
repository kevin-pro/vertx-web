/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.web;

import java.util.Map;
import rx.Observable;

/**
 * Represents a file-upload from an HTTP multipart form submission.
 * <p>
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.FileUpload original} non RX-ified interface using Vert.x codegen.
 */

public class FileUpload {

  final io.vertx.ext.web.FileUpload delegate;

  public FileUpload(io.vertx.ext.web.FileUpload delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * @return the name of the upload as provided in the form submission
   */
  public String name() { 
    String ret = delegate.name();
    return ret;
  }

  /**
   * @return the actual temporary file name on the server where the file was uploaded to.
   */
  public String uploadedFileName() { 
    String ret = delegate.uploadedFileName();
    return ret;
  }

  /**
   * @return the file name of the upload as provided in the form submission
   */
  public String fileName() { 
    String ret = delegate.fileName();
    return ret;
  }

  /**
   * @return the size of the upload, in bytes
   */
  public long size() { 
    long ret = delegate.size();
    return ret;
  }

  /**
   * @return the content type (MIME type) of the upload
   */
  public String contentType() { 
    String ret = delegate.contentType();
    return ret;
  }

  /**
   * @return the content transfer encoding of the upload - this describes how the upload was encoded in the form submission.
   */
  public String contentTransferEncoding() { 
    String ret = delegate.contentTransferEncoding();
    return ret;
  }

  /**
   * @return the charset of the upload
   */
  public String charSet() { 
    String ret = delegate.charSet();
    return ret;
  }


  public static FileUpload newInstance(io.vertx.ext.web.FileUpload arg) {
    return arg != null ? new FileUpload(arg) : null;
  }
}
