/*
 * Copyright © 2013-2020, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
/*
 * Creation : 23 juil. 2014
 */
package org.seedstack.audit.logback;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.seedstack.audit.AuditEvent;
import org.seedstack.audit.logback.LogbackTrailWriter;

public class LogbackTrailWriterTest {

    @Test
    public void testTrailWriter() {
        LogbackTrailWriter trailWriter = new LogbackTrailWriter();
        trailWriter.writeEvent(mock(AuditEvent.class));
    }
}
