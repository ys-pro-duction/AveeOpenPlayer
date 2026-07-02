package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.h20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5004h20 {
    public Object a;
    public List b = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.h20$a */
    public static class a {
        public InterfaceC5694jX a;
        public Object b;

        public a(InterfaceC5694jX interfaceC5694jX, Object obj) {
            AbstractC6278lb.f(interfaceC5694jX);
            AbstractC6278lb.f(obj);
            this.a = interfaceC5694jX;
            this.b = obj;
        }

        public InterfaceC5694jX c() {
            return this.a;
        }

        public Object d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return this.a.hashCode() + this.b.hashCode();
        }
    }

    public C5004h20(Object obj) {
        AbstractC6278lb.f(obj);
        this.a = obj;
    }

    public void a(a aVar) {
        if (this.a.equals(aVar.a) && !this.b.contains(aVar.b)) {
            this.b.add(aVar.b);
        }
    }

    public boolean b(Object obj) {
        return this.b.contains(obj);
    }

    public void c(a aVar) {
        if (this.a.equals(aVar.a)) {
            this.b.remove(aVar.b);
        }
    }
}
