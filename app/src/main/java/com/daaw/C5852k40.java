package com.daaw;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.k40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5852k40 implements DG {
    public static final InterfaceC6349lp0 e = new InterfaceC6349lp0() { // from class: com.daaw.h40
        @Override // com.daaw.BG
        public final void a(Object obj, Object obj2) {
            C5852k40.c(obj, (InterfaceC6628mp0) obj2);
        }
    };
    public static final InterfaceC8795uc1 f = new InterfaceC8795uc1() { // from class: com.daaw.i40
        @Override // com.daaw.BG
        public final void a(Object obj, Object obj2) {
            ((InterfaceC9081vc1) obj2).c((String) obj);
        }
    };
    public static final InterfaceC8795uc1 g = new InterfaceC8795uc1() { // from class: com.daaw.j40
        @Override // com.daaw.BG
        public final void a(Object obj, Object obj2) {
            ((InterfaceC9081vc1) obj2).d(((Boolean) obj).booleanValue());
        }
    };
    public static final b h = new b(null);
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public InterfaceC6349lp0 c = e;
    public boolean d = false;

    /* JADX INFO: renamed from: com.daaw.k40$a */
    public class a implements InterfaceC2073Qv {
        public a() {
        }

        @Override // com.daaw.InterfaceC2073Qv
        public void a(Object obj, Writer writer) {
            C9215w40 c9215w40 = new C9215w40(writer, C5852k40.this.a, C5852k40.this.b, C5852k40.this.c, C5852k40.this.d);
            c9215w40.i(obj, false);
            c9215w40.r();
        }

        @Override // com.daaw.InterfaceC2073Qv
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.k40$b */
    public static final class b implements InterfaceC8795uc1 {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, InterfaceC9081vc1 interfaceC9081vc1) {
            interfaceC9081vc1.c(a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C5852k40() {
        m(String.class, f);
        m(Boolean.class, g);
        m(Date.class, h);
    }

    public static /* synthetic */ void c(Object obj, InterfaceC6628mp0 interfaceC6628mp0) {
        throw new GG("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public InterfaceC2073Qv i() {
        return new a();
    }

    public C5852k40 j(InterfaceC9986yq interfaceC9986yq) {
        interfaceC9986yq.a(this);
        return this;
    }

    public C5852k40 k(boolean z) {
        this.d = z;
        return this;
    }

    @Override // com.daaw.DG
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5852k40 a(Class cls, InterfaceC6349lp0 interfaceC6349lp0) {
        this.a.put(cls, interfaceC6349lp0);
        this.b.remove(cls);
        return this;
    }

    public C5852k40 m(Class cls, InterfaceC8795uc1 interfaceC8795uc1) {
        this.b.put(cls, interfaceC8795uc1);
        this.a.remove(cls);
        return this;
    }
}
