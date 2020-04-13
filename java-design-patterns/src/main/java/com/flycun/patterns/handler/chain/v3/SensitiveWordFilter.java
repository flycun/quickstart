package com.flycun.patterns.handler.chain.v3;

public interface SensitiveWordFilter {
    boolean doFilter(Content content);
}