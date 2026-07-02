package com.daaw;

import android.content.Context;
import com.daaw.C6262lX0;
import com.daaw.C6305lg1;
import com.daaw.C9395wj1;
import com.google.firebase.firestore.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: renamed from: com.daaw.ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4408ew {
    public static final Set e = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));
    public final C4129dw a;
    public final MG0 b;
    public final C9632xb c;
    public final C7612qM d;

    /* JADX INFO: renamed from: com.daaw.ew$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            a = iArr;
            try {
                iArr[c.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.a.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.a.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.a.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.a.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.a.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.a.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.a.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.a.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.a.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.a.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.a.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.a.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.a.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[c.a.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[c.a.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C4408ew(C4129dw c4129dw, C9632xb c9632xb, AbstractC5806ju abstractC5806ju, AbstractC5806ju abstractC5806ju2, Context context, InterfaceC7086oU interfaceC7086oU) {
        this.a = c4129dw;
        this.c = c9632xb;
        this.b = new MG0(c4129dw.a());
        this.d = d(c4129dw, c9632xb, abstractC5806ju, abstractC5806ju2, context, interfaceC7086oU);
    }

    public static boolean e(C6262lX0 c6262lX0) {
        c6262lX0.m();
        Throwable thL = c6262lX0.l();
        if (!(thL instanceof SSLHandshakeException)) {
            return false;
        }
        thL.getMessage().contains("no ciphers available");
        return false;
    }

    public static boolean f(C6262lX0 c6262lX0) {
        return g(c.a.c(c6262lX0.m().g()));
    }

    public static boolean g(c.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    public static boolean h(C6262lX0 c6262lX0) {
        return f(c6262lX0) && !c6262lX0.m().equals(C6262lX0.b.ABORTED);
    }

    public C6305lg1 a(C6305lg1.a aVar) {
        return new C6305lg1(this.d, this.c, this.b, aVar);
    }

    public C9395wj1 b(C9395wj1.a aVar) {
        return new C9395wj1(this.d, this.c, this.b, aVar);
    }

    public C4129dw c() {
        return this.a;
    }

    public C7612qM d(C4129dw c4129dw, C9632xb c9632xb, AbstractC5806ju abstractC5806ju, AbstractC5806ju abstractC5806ju2, Context context, InterfaceC7086oU interfaceC7086oU) {
        return new C7612qM(c9632xb, context, abstractC5806ju, abstractC5806ju2, c4129dw, interfaceC7086oU);
    }
}
