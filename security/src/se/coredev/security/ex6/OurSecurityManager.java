package se.coredev.security.ex6;

import java.security.Permission;

public final class OurSecurityManager extends SecurityManager {
	
	@Override
	public void checkPermission(Permission perm) {
		if ("suppressAccessChecks".equals(perm.getName())) {
			throw new SecurityException("Do not try!!!");
		}
		super.checkPermission(perm);
	}
}
