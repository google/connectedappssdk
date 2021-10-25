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
package com.google.android.enterprise.connectedapps.testing;

import com.google.android.enterprise.connectedapps.ProfileConnector;

/** Implemented by generated {@link ProfileConnector} fakes. */
public interface FakeProfileConnector extends ProfileConnector {

  /**
   * Disconnect after an automatic connection.
   *
   * <p>In reality, this timeout happens some arbitrary time of no interaction with the other
   * profile.
   *
   * <p>If there are any connection holders, then this will do nothing.
   */
  void timeoutConnection();

  /**
   * Force the connector to be "automatically" connected.
   *
   * <p>This call should only be used by the SDK and should not be called in tests. If you want to
   * connect manually, use {@link #addConnectionHolder(Object)}, or for automatic management just
   * make the asynchronous call directly.
   *
   * @hide
   */
  void automaticallyConnect();

  /**
   * Returns true if explicit connection holders have been added.
   *
   * <p>This call should only be used by the SDK and should not be called in tests.
   *
   * @hide
   */
  boolean hasExplicitConnectionHolders();
}
