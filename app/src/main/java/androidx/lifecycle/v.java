package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.y;
import com.daaw.AbstractC3414bN0;
import com.daaw.AbstractC5247hu;
import com.daaw.AbstractC8526te1;
import com.daaw.AbstractC9091ve1;
import com.daaw.C6;
import com.daaw.G10;
import com.daaw.InterfaceC3135aN0;
import com.daaw.J50;
import com.daaw.YM0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class v extends y.e implements y.c {
    public Application a;
    public final y.c b;
    public Bundle c;
    public g d;
    public YM0 e;

    public v(Application application, InterfaceC3135aN0 interfaceC3135aN0, Bundle bundle) {
        G10.g(interfaceC3135aN0, "owner");
        this.e = interfaceC3135aN0.p();
        this.d = interfaceC3135aN0.w();
        this.c = bundle;
        this.a = application;
        this.b = application != null ? y.a.e.a(application) : new y.a();
    }

    @Override // androidx.lifecycle.y.c
    public AbstractC8526te1 a(Class cls) {
        G10.g(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.y.c
    public /* synthetic */ AbstractC8526te1 b(J50 j50, AbstractC5247hu abstractC5247hu) {
        return AbstractC9091ve1.a(this, j50, abstractC5247hu);
    }

    @Override // androidx.lifecycle.y.c
    public AbstractC8526te1 c(Class cls, AbstractC5247hu abstractC5247hu) {
        G10.g(cls, "modelClass");
        G10.g(abstractC5247hu, "extras");
        String str = (String) abstractC5247hu.a(y.d.c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (abstractC5247hu.a(u.a) == null || abstractC5247hu.a(u.b) == null) {
            if (this.d != null) {
                return e(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) abstractC5247hu.a(y.a.g);
        boolean zIsAssignableFrom = C6.class.isAssignableFrom(cls);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? AbstractC3414bN0.c(cls, AbstractC3414bN0.b) : AbstractC3414bN0.c(cls, AbstractC3414bN0.a);
        return constructorC == null ? this.b.c(cls, abstractC5247hu) : (!zIsAssignableFrom || application == null) ? AbstractC3414bN0.d(cls, constructorC, u.a(abstractC5247hu)) : AbstractC3414bN0.d(cls, constructorC, application, u.a(abstractC5247hu));
    }

    @Override // androidx.lifecycle.y.e
    public void d(AbstractC8526te1 abstractC8526te1) {
        G10.g(abstractC8526te1, "viewModel");
        if (this.d != null) {
            YM0 ym0 = this.e;
            G10.d(ym0);
            g gVar = this.d;
            G10.d(gVar);
            f.a(abstractC8526te1, ym0, gVar);
        }
    }

    public final AbstractC8526te1 e(String str, Class cls) {
        AbstractC8526te1 abstractC8526te1D;
        Application application;
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(cls, "modelClass");
        g gVar = this.d;
        if (gVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C6.class.isAssignableFrom(cls);
        Constructor constructorC = (!zIsAssignableFrom || this.a == null) ? AbstractC3414bN0.c(cls, AbstractC3414bN0.b) : AbstractC3414bN0.c(cls, AbstractC3414bN0.a);
        if (constructorC == null) {
            return this.a != null ? this.b.a(cls) : y.d.a.a().a(cls);
        }
        YM0 ym0 = this.e;
        G10.d(ym0);
        t tVarB = f.b(ym0, gVar, str, this.c);
        if (!zIsAssignableFrom || (application = this.a) == null) {
            abstractC8526te1D = AbstractC3414bN0.d(cls, constructorC, tVarB.d());
        } else {
            G10.d(application);
            abstractC8526te1D = AbstractC3414bN0.d(cls, constructorC, application, tVarB.d());
        }
        abstractC8526te1D.a("androidx.lifecycle.savedstate.vm.tag", tVarB);
        return abstractC8526te1D;
    }
}
