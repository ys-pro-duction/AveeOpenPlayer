package com.daaw;

/* JADX INFO: renamed from: com.daaw.uK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8719uK {
    public static final a a = new a();
    public static final b b = new b();

    /* JADX INFO: renamed from: com.daaw.uK$a */
    public static class a extends AbstractC8719uK {
        @Override // com.daaw.AbstractC8719uK
        public String a() {
            return "FieldValue.delete";
        }
    }

    /* JADX INFO: renamed from: com.daaw.uK$b */
    public static class b extends AbstractC8719uK {
        @Override // com.daaw.AbstractC8719uK
        public String a() {
            return "FieldValue.serverTimestamp";
        }
    }

    public static AbstractC8719uK b() {
        return b;
    }

    public abstract String a();
}
