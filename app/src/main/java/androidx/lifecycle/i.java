package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.daaw.AbstractC4499fG;
import com.daaw.G10;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i a = new i();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static final class a extends AbstractC4499fG {
        @Override // com.daaw.AbstractC4499fG, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            G10.g(activity, "activity");
            q.INSTANCE.c(activity);
        }
    }

    public static final void a(Context context) {
        G10.g(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        G10.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
