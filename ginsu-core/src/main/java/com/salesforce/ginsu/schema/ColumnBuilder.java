/**
 * Copyright (c) 2018, salesforce.com, inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */
package com.salesforce.ginsu.schema;

import java.util.Properties;
import java.util.function.Function;

/**
 * @author pcal
 * @since 0.0.1
 */
public interface ColumnBuilder<T> {

    ColumnBuilder<T> nullable(boolean isNullable);

    ColumnBuilder<T> setMaxLength(int length);

    ColumnBuilder<T> valueConverter(Function<Object, T> converter);

    ColumnBuilder<T> needsIndex(boolean b);

    ColumnBuilder<T> defaultValue(T o);

    Column build();
}