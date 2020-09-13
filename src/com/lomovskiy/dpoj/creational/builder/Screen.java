package com.lomovskiy.dpoj.creational.builder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Screen {

    private @Nullable String title;
    private @Nullable String header;
    private @Nullable String footer;

    private Screen(@NotNull Builder builder) {
        title = builder.title;
        header = builder.header;
        footer = builder.footer;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "title='" + title + '\'' +
                ", header='" + header + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }

    public static class Builder {

        private @Nullable String title;
        private @Nullable String header;
        private @Nullable String footer;

        public Builder setTitle(@NotNull String title) {
            this.title = title;
            return this;
        }

        public Builder setHeader(@NotNull String header) {
            this.header = header;
            return this;
        }

        public Builder setFooter(@NotNull String footer) {
            this.footer = footer;
            return this;
        }

        public Screen build() {
            return new Screen(this);
        }

    }

}