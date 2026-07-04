package com.daaw;

import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.Ck0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0544Ck0 {
    public final C9374wf0 a;

    /* JADX INFO: renamed from: com.daaw.Ck0$a */
    public class a extends C9374wf0 {
        public a(int i) {
            super(i);
        }

        @Override // com.daaw.C9374wf0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ck0$b */
    public static final class b {
        public static final Queue d = AbstractC6559mb1.d(0);
        public int a;
        public int b;
        public Object c;

        public static b a(Object obj, int i, int i2) {
            b bVar = (b) d.poll();
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i, i2);
            return bVar;
        }

        public final void b(Object obj, int i, int i2) {
            this.c = obj;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            d.offer(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public C0544Ck0(int i) {
        this.a = new a(i);
    }

    public Object a(Object obj, int i, int i2) {
        b bVarA = b.a(obj, i, i2);
        Object objG = this.a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i, int i2, Object obj2) {
        this.a.k(b.a(obj, i, i2), obj2);
    }
}
