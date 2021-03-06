/*
 * Copyright © 2013-2020, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.audit.spi;

import org.seedstack.audit.AuditEvent;

/**
 * Interface used to write an event in its final form (log, bdd...)
 */
public interface TrailWriter {

    /**
     * Writes the event
     *
     * @param auditEvent the event to write
     */
    void writeEvent(AuditEvent auditEvent);
}
