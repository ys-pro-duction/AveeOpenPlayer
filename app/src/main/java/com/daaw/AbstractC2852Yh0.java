package com.daaw;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: renamed from: com.daaw.Yh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2852Yh0 {
    public static final b a = new b(null);

    /* JADX INFO: renamed from: com.daaw.Yh0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC2852Yh0 a(Context context) {
            G10.g(context, "context");
            T2 t2 = T2.a;
            t2.a();
            if (t2.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        public b() {
        }
    }

    public abstract Object a(AbstractC3584bz abstractC3584bz, InterfaceC1416Ks interfaceC1416Ks);

    public abstract Object b(InterfaceC1416Ks interfaceC1416Ks);

    public abstract Object c(Uri uri, InputEvent inputEvent, InterfaceC1416Ks interfaceC1416Ks);

    public abstract Object d(Uri uri, InterfaceC1416Ks interfaceC1416Ks);

    public abstract Object e(AbstractC1266Jg1 abstractC1266Jg1, InterfaceC1416Ks interfaceC1416Ks);

    public abstract Object f(AbstractC1370Kg1 abstractC1370Kg1, InterfaceC1416Ks interfaceC1416Ks);

    /* JADX INFO: renamed from: com.daaw.Yh0$a */
    public static final class a extends AbstractC2852Yh0 {
        public final MeasurementManager b;

        public a(MeasurementManager measurementManager) {
            G10.g(measurementManager, "mMeasurementManager");
            this.b = measurementManager;
        }

        @Override // com.daaw.AbstractC2852Yh0
        public Object a(AbstractC3584bz abstractC3584bz, InterfaceC1416Ks interfaceC1416Ks) {
            C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
            c4067dj.y();
            this.b.deleteRegistrations(k(abstractC3584bz), new ExecutorC2748Xh0(), AbstractC7475pr0.a(c4067dj));
            Object objU = c4067dj.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU == I10.c() ? objU : G91.a;
        }

        @Override // com.daaw.AbstractC2852Yh0
        public Object b(InterfaceC1416Ks interfaceC1416Ks) {
            C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
            c4067dj.y();
            this.b.getMeasurementApiStatus(new ExecutorC2748Xh0(), AbstractC7475pr0.a(c4067dj));
            Object objU = c4067dj.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU;
        }

        @Override // com.daaw.AbstractC2852Yh0
        public Object c(Uri uri, InputEvent inputEvent, InterfaceC1416Ks interfaceC1416Ks) {
            C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
            c4067dj.y();
            this.b.registerSource(uri, inputEvent, new ExecutorC2748Xh0(), AbstractC7475pr0.a(c4067dj));
            Object objU = c4067dj.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU == I10.c() ? objU : G91.a;
        }

        @Override // com.daaw.AbstractC2852Yh0
        public Object d(Uri uri, InterfaceC1416Ks interfaceC1416Ks) {
            C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
            c4067dj.y();
            this.b.registerTrigger(uri, new ExecutorC2748Xh0(), AbstractC7475pr0.a(c4067dj));
            Object objU = c4067dj.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU == I10.c() ? objU : G91.a;
        }

        @Override // com.daaw.AbstractC2852Yh0
        public Object e(AbstractC1266Jg1 abstractC1266Jg1, InterfaceC1416Ks interfaceC1416Ks) {
            C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
            c4067dj.y();
            this.b.registerWebSource(l(abstractC1266Jg1), new ExecutorC2748Xh0(), AbstractC7475pr0.a(c4067dj));
            Object objU = c4067dj.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU == I10.c() ? objU : G91.a;
        }

        @Override // com.daaw.AbstractC2852Yh0
        public Object f(AbstractC1370Kg1 abstractC1370Kg1, InterfaceC1416Ks interfaceC1416Ks) {
            C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
            c4067dj.y();
            this.b.registerWebTrigger(m(abstractC1370Kg1), new ExecutorC2748Xh0(), AbstractC7475pr0.a(c4067dj));
            Object objU = c4067dj.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU == I10.c() ? objU : G91.a;
        }

        public final DeletionRequest k(AbstractC3584bz abstractC3584bz) {
            AbstractC2540Vh0.a();
            throw null;
        }

        public final WebSourceRegistrationRequest l(AbstractC1266Jg1 abstractC1266Jg1) {
            AbstractC2644Wh0.a();
            throw null;
        }

        public final WebTriggerRegistrationRequest m(AbstractC1370Kg1 abstractC1370Kg1) {
            AbstractC1684Nh0.a();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context) {
            G10.g(context, "context");
            Object systemService = context.getSystemService((Class<Object>) AbstractC2018Qh0.a());
            G10.f(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC2122Rh0.a(systemService));
        }
    }
}
