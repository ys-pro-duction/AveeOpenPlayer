package com.daaw;

/* JADX INFO: renamed from: com.daaw.u53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8658u53 {
    public static String a(AbstractC9213w33 abstractC9213w33) {
        StringBuilder sb = new StringBuilder(abstractC9213w33.y());
        for (int i = 0; i < abstractC9213w33.y(); i++) {
            byte bQ = abstractC9213w33.q(i);
            if (bQ == 34) {
                sb.append("\\\"");
            } else if (bQ == 39) {
                sb.append("\\'");
            } else if (bQ != 92) {
                switch (bQ) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bQ < 32 || bQ > 126) {
                            sb.append('\\');
                            sb.append((char) (((bQ >>> 6) & 3) + 48));
                            sb.append((char) (((bQ >>> 3) & 7) + 48));
                            sb.append((char) ((bQ & 7) + 48));
                        } else {
                            sb.append((char) bQ);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
