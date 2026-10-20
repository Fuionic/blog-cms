package io.atomity.blogcms.post;

import io.atomity.blogcms.post.dto.PostListQuery;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PostListQueryTest {

    @Test
    void capsPageNumber() {
        PostListQuery query = new PostListQuery(null, null, null, null, null, null, Integer.MAX_VALUE, null);

        assertThat(query.toPageable().getPageNumber()).isEqualTo(10_000);
    }

    @Test
    void negativePageNumberDefaultsToFirstPage() {
        PostListQuery query = new PostListQuery(null, null, null, null, null, null, -1, null);

        assertThat(query.toPageable().getPageNumber()).isZero();
    }
}
