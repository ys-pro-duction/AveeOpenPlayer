package com.daaw;

/* JADX INFO: renamed from: com.daaw.d81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3910d81 implements InterfaceC9509x70 {
    public static final a B = new a(null);

    /* JADX INFO: renamed from: com.daaw.d81$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.d81$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0165a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[D70.values().length];
                try {
                    iArr[D70.B.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[D70.C.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[D70.D.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final String a(InterfaceC9509x70 interfaceC9509x70) {
            G10.g(interfaceC9509x70, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C0165a.a[interfaceC9509x70.o().ordinal()];
            if (i == 2) {
                sb.append("in ");
            } else if (i == 3) {
                sb.append("out ");
            }
            sb.append(interfaceC9509x70.getName());
            String string = sb.toString();
            G10.f(string, "toString(...)");
            return string;
        }

        public a() {
        }
    }
}
