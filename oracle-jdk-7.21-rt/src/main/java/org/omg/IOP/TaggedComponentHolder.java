/*    */ package org.omg.IOP;
/*    */ 
/*    */ import org.omg.CORBA.TypeCode;
/*    */ import org.omg.CORBA.portable.InputStream;
/*    */ import org.omg.CORBA.portable.OutputStream;
/*    */ import org.omg.CORBA.portable.Streamable;
/*    */ 
/*    */ public final class TaggedComponentHolder
/*    */   implements Streamable
/*    */ {
/* 12 */   public TaggedComponent value = null;
/*    */ 
/*    */   public TaggedComponentHolder()
/*    */   {
/*    */   }
/*    */ 
/*    */   public TaggedComponentHolder(TaggedComponent paramTaggedComponent)
/*    */   {
/* 20 */     this.value = paramTaggedComponent;
/*    */   }
/*    */ 
/*    */   public void _read(InputStream paramInputStream)
/*    */   {
/* 25 */     this.value = TaggedComponentHelper.read(paramInputStream);
/*    */   }
/*    */ 
/*    */   public void _write(OutputStream paramOutputStream)
/*    */   {
/* 30 */     TaggedComponentHelper.write(paramOutputStream, this.value);
/*    */   }
/*    */ 
/*    */   public TypeCode _type()
/*    */   {
/* 35 */     return TaggedComponentHelper.type();
/*    */   }
/*    */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     org.omg.IOP.TaggedComponentHolder
 * JD-Core Version:    0.6.2
 */