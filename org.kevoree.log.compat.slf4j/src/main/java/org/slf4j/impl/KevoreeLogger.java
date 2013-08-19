/**
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.slf4j.impl;


import org.kevoree.log.Log;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

public class KevoreeLogger extends MarkerIgnoringBase {

    protected KevoreeLogger() {
    }

    private MessageFormatter formatter = new MessageFormatter();

    public static final KevoreeLogger logger = new KevoreeLogger();

    public String getName() {
        return "KevoreeLog";
    }

    final public boolean isTraceEnabled() {
        return Log.TRACE;
    }

    final public void trace(String msg) {
        Log.trace(msg);
    }

    final public void trace(String format, Object arg) {
        Log.trace(arg.toString());
    }

    public final void trace(String format, Object arg1, Object arg2) {
        Log.trace(MessageFormatter.format(format, arg1, arg2).getMessage());
    }

    public final void trace(String format, Object[] argArray) {
        Log.trace(MessageFormatter.format(format, argArray).getMessage());
    }

    final public void trace(String msg, Throwable t) {
        Log.trace(msg, t);
    }

    final public boolean isDebugEnabled() {
        return Log.DEBUG;
    }

    final public void debug(String msg) {
        Log.debug(msg);
    }


    final public void debug(String format, Object arg) {
        Log.debug(MessageFormatter.format(format, arg).getMessage());
    }

    public final void debug(String format, Object arg1, Object arg2) {
        Log.debug(MessageFormatter.format(format, arg1,arg2).getMessage());
    }

    public final void debug(String format, Object[] argArray) {
        Log.debug(MessageFormatter.format(format, argArray).getMessage());
    }

    final public void debug(String msg, Throwable t) {
        Log.debug(msg, t);
    }

    final public boolean isInfoEnabled() {
        return Log.INFO;
    }

    final public void info(String msg) {
        Log.info(msg);
    }

    final public void info(String format, Object arg1) {
        Log.info(MessageFormatter.format(format, arg1).getMessage());
    }

    final public void info(String format, Object arg1, Object arg2) {
        Log.info(MessageFormatter.format(format, arg1,arg2).getMessage());
    }

    public final void info(String format, Object[] argArray) {
        Log.info(MessageFormatter.format(format, argArray).getMessage());
    }

    final public void info(String msg, Throwable t) {
        Log.info(msg, t);
    }

    final public boolean isWarnEnabled() {
        return Log.WARN;
    }

    final public void warn(String msg) {
        Log.warn(msg);
    }

    final public void warn(String format, Object arg1) {
        Log.warn(MessageFormatter.format(format, arg1).getMessage());
    }

    final public void warn(String format, Object arg1, Object arg2) {
        Log.warn(MessageFormatter.format(format, arg1,arg2).getMessage());
    }

    public final void warn(String format, Object[] argArray) {
        Log.warn(MessageFormatter.format(format, argArray).getMessage());
    }

    final public void warn(String msg, Throwable t) {
        Log.warn(msg, t);
    }

    final public boolean isErrorEnabled() {
        return Log.ERROR;
    }

    final public void error(String msg) {
        Log.error(msg);
    }

    final public void error(String format, Object arg1) {
        Log.error(MessageFormatter.format(format, arg1).getMessage());
    }

    final public void error(String format, Object arg1, Object arg2) {
        Log.error(MessageFormatter.format(format, arg1,arg2).getMessage());
    }

    public final void error(String format, Object[] argArray) {
        Log.error(MessageFormatter.format(format, argArray).getMessage());
    }

    final public void error(String msg, Throwable t) {
        Log.error(msg, t);
    }
}
