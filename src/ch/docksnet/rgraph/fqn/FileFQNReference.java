/*
 * Copyright (C) 2019 Stefan Zeller
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.docksnet.rgraph.fqn;

import com.intellij.psi.PsiElement;

public class FileFQNReference {
    private final FileFQN fileFQN;
    private final int referencesCount;

    public FileFQNReference(FileFQN fileFQN, int referencesCount) {
        this.fileFQN = fileFQN;
        this.referencesCount = referencesCount;
    }

    public PsiElement getPsiElement() {
        return this.fileFQN.getPsiJavaFile();
    }

    public String toUsageString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.referencesCount);
        sb.append(" ");
        if (this.referencesCount == 1) {
            sb.append("usage");
        } else {
            sb.append("usages");
        }
        return sb.toString();
    }
}
