package com.revenuecat.purchases.common;

import com.daaw.AbstractC1369Kg0;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2911Yw;
import com.daaw.C8146sG0;
import com.daaw.G10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/Anonymizer;", "", "<init>", "()V", "valueToAnonymize", "anonymizedAny", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "textToAnonymize", "anonymizedString", "(Ljava/lang/String;)Ljava/lang/String;", "", "mapToAnonymize", "anonymizedMap", "(Ljava/util/Map;)Ljava/util/Map;", "anonymizedStringMap", "Lcom/daaw/sG0;", "anonymizeRegex", "Lcom/daaw/sG0;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Anonymizer {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EMAIL_REGEX = "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+";

    @Deprecated
    public static final String IP_REGEX = "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}";

    @Deprecated
    public static final String REDACTED = "*****";

    @Deprecated
    public static final String UUID_REGEX = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}";
    private final C8146sG0 anonymizeRegex = new C8146sG0("[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+|[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}|((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/Anonymizer$Companion;", "", "()V", "EMAIL_REGEX", "", "IP_REGEX", "REDACTED", "UUID_REGEX", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        private Companion() {
        }
    }

    private final Object anonymizedAny(Object valueToAnonymize) {
        if (valueToAnonymize instanceof String) {
            return anonymizedString((String) valueToAnonymize);
        }
        if (valueToAnonymize instanceof List) {
            Iterable iterable = (Iterable) valueToAnonymize;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                arrayList.add(next == null ? null : anonymizedAny(next));
            }
            return arrayList;
        }
        if (!(valueToAnonymize instanceof Map)) {
            return valueToAnonymize;
        }
        Map map = (Map) valueToAnonymize;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1369Kg0.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.put(key, value == null ? null : anonymizedAny(value));
        }
        return linkedHashMap;
    }

    public final Map<String, Object> anonymizedMap(Map<String, ? extends Object> mapToAnonymize) {
        G10.g(mapToAnonymize, "mapToAnonymize");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1369Kg0.d(mapToAnonymize.size()));
        Iterator<T> it = mapToAnonymize.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedAny(entry.getValue()));
        }
        return linkedHashMap;
    }

    public final String anonymizedString(String textToAnonymize) {
        G10.g(textToAnonymize, "textToAnonymize");
        return this.anonymizeRegex.c(textToAnonymize, REDACTED);
    }

    public final Map<String, String> anonymizedStringMap(Map<String, String> mapToAnonymize) {
        G10.g(mapToAnonymize, "mapToAnonymize");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1369Kg0.d(mapToAnonymize.size()));
        Iterator<T> it = mapToAnonymize.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedString((String) entry.getValue()));
        }
        return linkedHashMap;
    }
}
