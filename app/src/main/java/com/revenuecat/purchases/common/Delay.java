package com.revenuecat.purchases.common;

import com.daaw.LE;
import com.daaw.OE;
import com.daaw.PE;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001c\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/Delay;", "", "Lcom/daaw/LE;", "minDelay", "maxDelay", "<init>", "(Ljava/lang/String;IJJ)V", "J", "getMinDelay-UwyO8pc", "()J", "getMaxDelay-UwyO8pc", "NONE", "DEFAULT", "LONG", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Delay {
    private static final /* synthetic */ Delay[] $VALUES;
    public static final Delay DEFAULT;
    public static final Delay LONG;
    public static final Delay NONE;
    private final long maxDelay;
    private final long minDelay;

    private static final /* synthetic */ Delay[] $values() {
        return new Delay[]{NONE, DEFAULT, LONG};
    }

    static {
        LE.a aVar = LE.B;
        PE pe = PE.E;
        NONE = new Delay("NONE", 0, OE.o(0, pe), OE.o(0, pe));
        long jO = OE.o(0, pe);
        DispatcherConstants dispatcherConstants = DispatcherConstants.INSTANCE;
        DEFAULT = new Delay("DEFAULT", 1, jO, dispatcherConstants.m96getJitterDelayUwyO8pc());
        LONG = new Delay("LONG", 2, dispatcherConstants.m96getJitterDelayUwyO8pc(), dispatcherConstants.m97getJitterLongDelayUwyO8pc());
        $VALUES = $values();
    }

    private Delay(String str, int i, long j, long j2) {
        this.minDelay = j;
        this.maxDelay = j2;
    }

    public static Delay valueOf(String str) {
        return (Delay) Enum.valueOf(Delay.class, str);
    }

    public static Delay[] values() {
        return (Delay[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getMaxDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getMaxDelay() {
        return this.maxDelay;
    }

    /* JADX INFO: renamed from: getMinDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getMinDelay() {
        return this.minDelay;
    }
}
