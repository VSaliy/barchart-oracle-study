package com.sun.deploy.model;

import java.net.URL;
import java.security.CodeSource;
import java.util.Enumeration;
import java.util.jar.JarFile;

public abstract interface DeployCacheJarAccess
{
  public abstract Enumeration entryNames(JarFile paramJarFile, CodeSource[] paramArrayOfCodeSource);

  public abstract CodeSource[] getCodeSources(JarFile paramJarFile, URL paramURL);

  public abstract CodeSource getCodeSource(JarFile paramJarFile, URL paramURL, String paramString);

  public abstract void setEagerValidation(JarFile paramJarFile, boolean paramBoolean);
}

/* Location:           /home/user1/Temp/jvm/deploy.jar
 * Qualified Name:     com.sun.deploy.model.DeployCacheJarAccess
 * JD-Core Version:    0.6.2
 */