/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.cache.ehcache.internal;

import net.sf.ehcache.Cache;

import org.hibernate.cache.spi.support.DomainDataStorageAccess;

/**
 * @author Steve Ebersole
 */
public class DomainDataStorageAccessImpl extends StorageAccessImpl implements DomainDataStorageAccess {
	public DomainDataStorageAccessImpl(Cache underlyingCache) {
		super( underlyingCache );
	}

	@Override
	public void putFromLoad(Object key, Object value) {
		putIntoCache( key, value );
	}
}
