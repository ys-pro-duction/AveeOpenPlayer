package com.daaw;

import com.daaw.C5327iB0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.iB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5327iB0 {
    public final Map a;
    public final Map b;
    public final InterfaceC6349lp0 c;

    /* JADX INFO: renamed from: com.daaw.iB0$a */
    public static final class a implements DG {
        public static final InterfaceC6349lp0 d = new InterfaceC6349lp0() { // from class: com.daaw.hB0
            @Override // com.daaw.BG
            public final void a(Object obj, Object obj2) {
                C5327iB0.a.b(obj, (InterfaceC6628mp0) obj2);
            }
        };
        public final Map a = new HashMap();
        public final Map b = new HashMap();
        public InterfaceC6349lp0 c = d;

        public static /* synthetic */ void b(Object obj, InterfaceC6628mp0 interfaceC6628mp0) {
            throw new GG("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public C5327iB0 c() {
            return new C5327iB0(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(InterfaceC9986yq interfaceC9986yq) {
            interfaceC9986yq.a(this);
            return this;
        }

        @Override // com.daaw.DG
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, InterfaceC6349lp0 interfaceC6349lp0) {
            this.a.put(cls, interfaceC6349lp0);
            this.b.remove(cls);
            return this;
        }
    }

    public C5327iB0(Map map, Map map2, InterfaceC6349lp0 interfaceC6349lp0) {
        this.a = map;
        this.b = map2;
        this.c = interfaceC6349lp0;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new C4769gB0(outputStream, this.a, this.b, this.c).s(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
