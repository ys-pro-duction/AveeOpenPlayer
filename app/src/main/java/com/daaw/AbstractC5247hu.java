package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5247hu {
    public final Map a = new LinkedHashMap();

    /* JADX INFO: renamed from: com.daaw.hu$a */
    public static final class a extends AbstractC5247hu {
        public static final a b = new a();

        @Override // com.daaw.AbstractC5247hu
        public Object a(b bVar) {
            G10.g(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.hu$b */
    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.a;
    }
}
