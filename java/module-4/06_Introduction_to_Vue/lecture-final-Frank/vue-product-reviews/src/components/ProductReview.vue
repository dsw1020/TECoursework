<template>
    <div class="main">
        <h2>Product Reviews for {{ name }} </h2>
        <p class="description"> {{ description }} </p>
    </div>
</template>
<script>
export default { /* data to be used in the template */
    name: 'product-review',  // name for this set of data
    data() { /* data to be returned to Vue when it needs data */
        return {                                /* an object must be returned by the data function */
                                                /*    to keep this components data separate from other component */
            name: 'Cigar Party for Dummies',    /* this is the variable used in the html */
            description: 'Host and plan the perfect cigar celebration for all of your squirrely friends'
 }
}  
}
</script>
<style scoped> /* Only apply this css to things in this file */
div.main {
    margin: 1rem 0;
}
</style>