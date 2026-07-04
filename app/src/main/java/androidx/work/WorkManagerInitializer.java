package androidx.work;

import android.content.Context;
import androidx.work.a;
import com.daaw.AbstractC0329Ai1;
import com.daaw.AbstractC1772Od0;
import com.daaw.GZ;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements GZ {
    public static final String a = AbstractC1772Od0.f("WrkMgrInitializer");

    @Override // com.daaw.GZ
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.daaw.GZ
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC0329Ai1 b(Context context) {
        AbstractC1772Od0.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        AbstractC0329Ai1.e(context, new a.b().a());
        return AbstractC0329Ai1.d(context);
    }
}
