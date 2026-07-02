package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10385c implements Comparator, Serializable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C10385c(EnumC10386d enumC10386d, Comparator comparator) {
        this.c = enumC10386d;
        this.b = comparator;
    }

    public /* synthetic */ C10385c(Function function, Comparator comparator) {
        this.b = comparator;
        this.c = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iCompare = ((EnumC10386d) this.c).compare(obj, obj2);
                return iCompare != 0 ? iCompare : this.b.compare(obj, obj2);
            default:
                Function function = (Function) this.c;
                return this.b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
