package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.o;
import com.daaw.AbstractC1599Mm;
import com.daaw.G10;
import com.daaw.GZ;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.W9;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lcom/daaw/GZ;", "Lcom/daaw/Ob0;", "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Lcom/daaw/Ob0;", "", "Ljava/lang/Class;", "a", "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements GZ {
    @Override // com.daaw.GZ
    public List a() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.GZ
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1764Ob0 b(Context context) {
        G10.g(context, "context");
        W9 w9E = W9.e(context);
        G10.f(w9E, "getInstance(context)");
        if (!w9E.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        i.a(context);
        o.b bVar = o.J;
        bVar.b(context);
        return bVar.a();
    }
}
