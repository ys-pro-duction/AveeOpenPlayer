package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.daaw.PW;

/* JADX INFO: renamed from: com.daaw.hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceConnectionC5251hv implements ServiceConnection {
    public Context a;

    /* JADX INFO: renamed from: com.daaw.hv$a */
    public class a extends AbstractC4693fv {
        public a(PW pw, ComponentName componentName, Context context) {
            super(pw, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, AbstractC4693fv abstractC4693fv);

    public void b(Context context) {
        this.a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(PW.a.B(iBinder), componentName, this.a));
    }
}
