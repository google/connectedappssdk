/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.enterprise.connectedapps.processor.containers;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

/** Context for connected apps code run before validation. */
public final class PreValidatorContext extends Context {

  private final ProcessingEnvironment processingEnv;

  public PreValidatorContext(ProcessingEnvironment processingEnv) {
    this.processingEnv = processingEnv;
  }

  @Override
  public ProcessingEnvironment processingEnv() {
    return processingEnv;
  }

  @Override
  public Elements elements() {
    return processingEnv.getElementUtils();
  }

  @Override
  public Types types() {
    return processingEnv.getTypeUtils();
  }
}
