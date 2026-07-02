package com.revenuecat.purchases.common;

import com.daaw.AbstractC2455Um;
import com.daaw.G10;
import com.revenuecat.purchases.LogHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/LogIntent;", "intent", "", "message", "Lcom/daaw/G91;", "log", "(Lcom/revenuecat/purchases/common/LogIntent;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/LogHandler;", "currentLogHandler", "Lcom/revenuecat/purchases/LogHandler;", "getCurrentLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setCurrentLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LogWrapperKt {
    private static LogHandler currentLogHandler = new DefaultLogHandler();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogIntent.values().length];
            try {
                iArr[LogIntent.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogIntent.GOOGLE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogIntent.GOOGLE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogIntent.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogIntent.PURCHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogIntent.RC_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LogIntent.RC_PURCHASE_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LogIntent.RC_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LogIntent.USER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LogIntent.WARNING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LogIntent.AMAZON_WARNING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LogIntent.AMAZON_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final LogHandler getCurrentLogHandler() {
        return currentLogHandler;
    }

    public static final void log(LogIntent logIntent, String str) {
        G10.g(logIntent, "intent");
        G10.g(str, "message");
        String str2 = AbstractC2455Um.n0(logIntent.getEmojiList(), "", null, null, 0, null, null, 62, null) + ' ' + str;
        switch (WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogUtilsKt.debugLog(str2);
                break;
            case 2:
                LogUtilsKt.errorLog$default(str2, null, 2, null);
                break;
            case 3:
                LogUtilsKt.warnLog(str2);
                break;
            case 4:
                LogUtilsKt.infoLog(str2);
                break;
            case 5:
                LogUtilsKt.debugLog(str2);
                break;
            case 6:
                LogUtilsKt.errorLog$default(str2, null, 2, null);
                break;
            case 7:
                LogUtilsKt.infoLog(str2);
                break;
            case 8:
                LogUtilsKt.debugLog(str2);
                break;
            case 9:
                LogUtilsKt.debugLog(str2);
                break;
            case 10:
                LogUtilsKt.warnLog(str2);
                break;
            case 11:
                LogUtilsKt.warnLog(str2);
                break;
            case 12:
                LogUtilsKt.errorLog$default(str2, null, 2, null);
                break;
        }
    }

    public static final void setCurrentLogHandler(LogHandler logHandler) {
        G10.g(logHandler, "<set-?>");
        currentLogHandler = logHandler;
    }
}
