/*    */ package com.sun.corba.se.spi.activation;
/*    */ 
/*    */ import org.omg.CORBA.TypeCode;
/*    */ import org.omg.CORBA.portable.InputStream;
/*    */ import org.omg.CORBA.portable.OutputStream;
/*    */ import org.omg.CORBA.portable.Streamable;
/*    */ 
/*    */ public final class ServerHolder
/*    */   implements Streamable
/*    */ {
/* 15 */   public Server value = null;
/*    */ 
/*    */   public ServerHolder()
/*    */   {
/*    */   }
/*    */ 
/*    */   public ServerHolder(Server paramServer)
/*    */   {
/* 23 */     this.value = paramServer;
/*    */   }
/*    */ 
/*    */   public void _read(InputStream paramInputStream)
/*    */   {
/* 28 */     this.value = ServerHelper.read(paramInputStream);
/*    */   }
/*    */ 
/*    */   public void _write(OutputStream paramOutputStream)
/*    */   {
/* 33 */     ServerHelper.write(paramOutputStream, this.value);
/*    */   }
/*    */ 
/*    */   public TypeCode _type()
/*    */   {
/* 38 */     return ServerHelper.type();
/*    */   }
/*    */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     com.sun.corba.se.spi.activation.ServerHolder
 * JD-Core Version:    0.6.2
 */