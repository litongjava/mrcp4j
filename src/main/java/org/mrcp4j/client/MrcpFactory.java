/*
 * MRCP4J - Java API implementation of MRCPv2 specification
 *
 * Copyright (C) 2005-2006 SpeechForge - http://www.speechforge.org
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 *
 * Contact: ngodfredsen@users.sourceforge.net
 *
 */
package org.mrcp4j.client;

/**
 * Provides factory methods for MRCPv2 clients to gain access to {@link org.mrcp4j.client.MrcpProvider} instances.
 * <p/>
 * Currently having to go through a factory to construct an MrcpProvider may seem like a bit of overkill.  However,
 * this is implemented this way in order to facilitate transitioning in the future to a design in which there may
 * be multiple provider implementations accessible through a single factory method.
 *
 * @author Niels Godfredsen {@literal <}<a href="mailto:ngodfredsen@users.sourceforge.net">ngodfredsen@users.sourceforge.net</a>{@literal >}
 */
public class MrcpFactory {

  private MrcpFactory() {
    // restrict instance initialization to private access
  }

  /**
   * Constructs a new {@code MrcpProvider} instance which provides client access to MRCP resources.
   * @return new provider instance.
   */
  public MrcpProvider createProvider() {
    return new MrcpProvider();
  }

  /**
   * Constructs a new {@code MrcpFactory} instance.
   * @return new factory instance.
   */
  public static MrcpFactory newInstance() {
    return new MrcpFactory();
  }
}