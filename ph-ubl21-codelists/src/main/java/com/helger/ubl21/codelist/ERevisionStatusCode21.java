/**
 * Copyright (C) 2014-2018 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ubl21.codelist;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.id.IHasID;
import com.helger.commons.lang.EnumHelper;


/**
 * This file was automatically generated from Genericode file RevisionStatusCode-2.1.gc. Do NOT edit!
 * It contains a total of 5 entries!
 * @author com.helger.ubl21.main.MainCreateEnumsGenericode21
 */
@CodingStyleguideUnaware
public enum ERevisionStatusCode21
    implements IHasID<String>
{
    ACCEPTED("ACCEPTED"),
    ACKNOWLEDGED("ACKNOWLEDGED"),
    NEW("NEW"),
    REJECTED("REJECTED"),
    SUPERSEDED("SUPERSEDED");
    private final String m_sID;

    private ERevisionStatusCode21(
        @Nonnull
        @Nonempty
        final String sID) {
        m_sID = sID;
    }

    @Nonnull
    @Nonempty
    public String getID() {
        return m_sID;
    }

    @Nullable
    public static ERevisionStatusCode21 getFromIDOrNull(
        @Nullable
        final String sID) {
        return EnumHelper.getFromIDOrNull(ERevisionStatusCode21 .class, sID);
    }
}
